class Character {
    constructor(name, profession, gender, age, strength, hp) {
        this.name = name;
        this.profession = profession;
        this.gender = gender;
        this.age = age;
        this.strength = strength;
        this.hp = hp;
    }

    printStats() {
        console.log(`Name: ${this.name} \nProfession: ${this.profession} \nGender: ${this.gender} \nAge: ${this.age} \nStrength: ${this.strength} \nHitPoints: ${this.hitpoints}`);
        console.log("\n-------------\n");
    }

    isAlive() {
        if(this.hp <= 0) {
            console.log("He's dead, Jim");
        } else  {
            console.log("I'm not dead yet.");
        }
    }
}

const member = new Character("Rabbit", "Mage", "Male", 40, 100, 400);

member.printStats();


class Animal {
    constructor(sleep, eat, drink, mate, wake)
}

class Dog extends Animal {
    constructor(walk)
    super() {
        this.sleep,
        this.eat,
        this.drink,
        this.mate
    
    }
}

class Bird extends Animal {
    constructor(fly) {
        this.fly = fly;
    }
    super() {
        this.sleep,
        this.eat,
        this.drink,
        this.mate
    }
}