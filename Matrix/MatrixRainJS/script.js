const canvas = document.getElementById('canvas1');
const ctx = canvas.getContext('2d');
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

let gradient = ctx.createLinearGradient(0, 0, canvas.innerWidth, canvas.innerHeight);
gradient.addColorStop(0, 'red');
gradient.addColorStop(0.2, 'yellow');
gradient.addColorStop(0.4, 'green');
gradient.addColorStop(0.6, 'cyan');
gradient.addColorStop(0.8, 'blue');
gradient.addColorStop(1, 'magenta');

class Symbol {
    constructor(x, y, fontSize, canvasHeight) {
        this.characters = 'アァカサタナハマヤャラワガザダバパイィキシチニヒミリヰギジヂビピウゥクスツヌフムユュルグズブヅプエェケセテネヘメレヱゲゼデベペオォコソトノホモヨョロヲゴゾドボポヴッン0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
        this.x = x;
        this.y = y;
        this.fontSize = fontSize;
        this.text = '';
        this.canvasHeight = canvasHeight;
    }
    draw(context) {    
        this.text = this.characters.charAt(Math.floor(Math.random()*this.characters.length));
        content.fillText(this.text, this.x * this.fontSize, this.y * this.fontSize);
        if (this.y * this.fontSize > this.canvasHeight && Math.random() > 0,98) {
            this.y = 0;
        } else {
            this.y += 1;
        }
    }
}

class Effect {    
    constructor(canvasWidth, canvasHeight) {
        this.canvasWidth = canvasWidth;
        this.canvasHeight = canvasHeight;
        this.fontSize = 25;
        this.columns = this.canvasWidth/this.fontSize;
        this.symbols = [];
        this.#initialize();
        console.log(this.symbols);
    }
    #initialize() {    
        for(let a = 0; a < this.columns; a++) {
            this.symbols[a] = new Symbol(a, 0, this.fontSize, this.canvasHeight);
        }
    }
    resize(width, height) {
        this.canvasHeight = height;
        this.canvasWidth = width;
        this.columns = this.canvasWidth/this.fontSize;
        this.symbols = [];
        this.#initialize;
    }   
}

const effect = new Effect(canvas.width, canvas.height);
let lastTime = 0;
const fps = 30;
const nextframe = 1000/fps;
let timer = 0;

function animate(timestamp) {
    const deltatime = timestamp - lastTime;
    lastTime = timestamp;
    if (timer > nextframe) {
        ctx.fillStyle = 'rgba(0,0,0,0.5)';
        ctx.textAlign = 'center';
        ctx.fillRect(0, 0, canvas.width, canvas.height);
        ctx.fillStyle = gradient; //'#0aff0a';
        ctx.font = effect.fontSize + 'px monospace';
        effect.symbols.forEach(Symbol => Symbol.draw(ctx));
        timer = 0;
    }
    else 
    {
        timer += deltatime;
    }
    requestAnimationFrame(animate);
}

animate(0);

window.addEventListener('resize',function(){
    canvas.width = window.innerWidth;
    canvas.height = window.innerHeight;
    effect.resize(canvas.width, canvas.height);
});