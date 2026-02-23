function createBatttle() {
    
    let attack = 0;
    let mana = 30;
    let enmyHp = 100; 

    console.log(`Enemy hp is ${enmyHp}`);

    function checkWin() {
        if (enmyHp <= 0) {
            console.log("GAME OVER! YOU WIN");
            return true;
        }
        return false;
    }

    function swordHit() {
        attack += 10;
        enmyHp -= attack;
        console.log(`You dealt +10dmg with your sword`);

        if (enmyHp <= 0) {
            console.log(`Enemy health: 0hp`);
        } else {
            console.log(`Enemy health: ${enmyHp}hp`);
        }
        checkWin();
    }

    function useFireBall() {
        if (mana <= 8) {
            console.log("Noth enough mana!");
            return;
        }

        mana -= 9;
        enmyHp -= 20;
        console.log(`You used -9mana to cast fire spell. Mana: ${mana}`);
        console.log(`You dealt +14dmg with magic`);
        console.log(`Enemy health: ${enmyHp}hp`);
        checkWin();
    }

    return {checkWin, swordHit, useFireBall}
}

const battle = createBatttle();
