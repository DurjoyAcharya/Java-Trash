// eslint-disable-next-line max-classes-per-file
class Car {
    constructor(brand) {
        this.brand = brand;
    }

    Present() {
        return `Car Name: ${this.brand}`;
    }
}
class Model extends Car {
    constructor(brand, model) {
        super(brand);
        this.model = model;
    }

    Show() {
        return `${this.Present()}, Model Name ${this.model}`;
    }
}
class Bike extends Model {
    constructor(brand, price) {
        super(brand);
        this.price = price;
    }

    Details() {
        return `Bike Name: ${this.brand} Price: ${this.price}`;
    }
}

const obj = new Model('Audi', 'GTA-5050');
console.log(obj.Show());
const obj2 = new Bike('Hero', 100500);
console.log(obj2.Details());

class Hp {
    constructor(name) {
        this.e = name;
    }

    get Hname() {
        return this.e;
    }

    set Hname(x) {
        this.e = x;
    }

    static Language() {
        return 'JavaScript Programming Language';
    }
}
const name = new Hp('Monir');
name.Hname = 'Tiger';
console.log(name.Hname);
console.log(Hp.Language());
