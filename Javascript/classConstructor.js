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

class Programmer {
    constructor(name, position, age, language) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.language = language;
    }

printInfo() {
    console.log(this.name);
}
}

const bob = new Programmer("Bob Smith", 'supreme', 33, 'js');
bob.printInfo();

class SrProgrammer extends Programmer {
    constructor(name, position, age, language, yearsExp) {
        super(name, position, age, language);

        this.yearsExp = yearsExp;
    }
    printInfo();
}