# JSX

Each JSX element is just syntactic sugar for calling `React.createElement(component, props, ...children)`. 
So, anything you can do with JSX can also be done with just plain JavaScript.

```javascript

class Hello extends React.Component {
  render() {
    return <div>Hello {this.props.toWhat}</div>;
  }
}

ReactDOM.render(
  <Hello toWhat="World" />,
  document.getElementById('root')
);


```

can be compiled to this code that does not use JSX:

````javascript
class Hello extends React.Component {
  render() {
    return React.createElement('div', null, `Hello ${this.props.toWhat}`);
  }
}

ReactDOM.render(
  React.createElement(Hello, {toWhat: 'World'}, null),
  document.getElementById('root')
);
````

If you get tired of typing React.createElement so much, one common pattern is to assign a shorthand:

```javascript
const e = React.createElement;

ReactDOM.render(
  e('div', null, 'Hello World'),
  document.getElementById('root')
);

```
