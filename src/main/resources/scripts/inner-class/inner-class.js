/**
 * Starting with TypeScript 1.6 we have class expressions (reference).
 * This means you can do the following :
 */

export class Foo {
    static Bar = class {

    }
}

// works!
var foo = new Foo();
var bar = new Foo.Bar();