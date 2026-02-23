let attack = 0;
let mana = 20;
let enmyHp = 50;

function swordHit() {
    attack += 5;
    enmyHp -= attack;
    console.log(`You dealt +5dmg with your sword`);
    console.log(`Enemy health: ${enmyHp}hp`);
}

function useFireBall() {
    mana -= 7;
    enmyHp -= 14;
    console.log(`You used fire spell. Mana: -${mana}`);
    console.log(`You dealt +14dmg with magic`);
    console.log(`Enemy health: ${enmyHp}hp`);
}

swordHit()
useFireBall()
if (enmyHp <= 0) {
    console.log("GAME OVER! YOU WIN");
}