# Component children


##### Why would you use `React.Children.map(props.children, () => )` instead of `props.children.map(() => )`

> React only makes props.children an array if there are more than one child elements, like this
So it’s not guaranteed that props.children will be an array.