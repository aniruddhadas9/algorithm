# What is the difference between State and props in ReactJs?

### react
**State**
- This is data maintained inside a component. It is local or owned by that specific component. The component itself will update the state using the setState function.

**Props**
- Data passed in from a parent component. props are read-only in the child component that receives them. However, callback functions can also be passed, which can be executed inside the child to initiate an update.

**difference**

The difference is all about which component owns the data. State is owned locally and updated by the component itself. Props are owned by a parent component and are read-only. Props can only be updated if a callback function is passed to the child to trigger an upstream change.

The state of a parent component can be passed a prop to the child. They are referencing the same value, but only the parent component can update it.
