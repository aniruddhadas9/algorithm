/*

documentation: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Functions/Method_definitions

Syntax:
var obj = {
  property( parameters… ) {},
  *generator( parameters… ) {},
  async property( parameters… ) {},
  async* generator( parameters… ) {},

  // with computed keys:
  [property]( parameters… ) {},
  *[generator]( parameters… ) {},
  async [property]( parameters… ) {},

  // compare getter/setter syntax:
  get property() {},
  set property(value) {}
};

 */

var obj = {
    foo() {
        return 'bar';
    }
}

console.log(obj.foo());
// expected output: "bar"
