function createBatttle() {
    
    let attack = 0;
    let mana = 30;
    let enmyHp = 100; 

    console.log(`Enemy hp is ${enmyHp}`);

    function checkWin() {
        if (enmyHp <= 0) {
            console.log("GAME OVER! YOU WIN");
            document.getElementById("winMessage").textContent = "GAME OVER! YOU WIN"
            return true;
        }
        return false;
    }

    function updateDispaly() {
        if (enmyHp <= 0) {
            document.getElementById("enmyHp").textContent = `Enmey HP: 0`;
            return;
        }
        document.getElementById("enmyHp").textContent = `Enmey HP: ${enmyHp}`;
        document.getElementById("mana").textContent = `Your mana: ${mana}`;
    }

    function swordHit() {
        if (checkWin()) return;

        enmyHp -= 10;
        console.log(`You dealt +10dmg with your sword`);

        if (enmyHp <= 0) {
            console.log(`Enemy health: 0hp`);
        } else {
            console.log(`Enemy health: ${enmyHp}hp`);
        }
        updateDispaly();
        checkWin();
    }

    function useFireBall() {
        if (checkWin()) return;

        if (mana <= 8) {
            console.log("Noth enough mana!");
            return;
        }

        mana -= 9;
        enmyHp -= 20;
        console.log(`You used -9mana to cast fire spell. Mana: ${mana}`);
        console.log(`You dealt +14dmg with magic`);
        console.log(`Enemy health: ${enmyHp}hp`);
        updateDispaly();
        checkWin();
    }

    return {checkWin, swordHit, useFireBall}
}

const battle = createBatttle();
