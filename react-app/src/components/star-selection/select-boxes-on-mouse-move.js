import React from 'react';
import './select-boxes-on-mouse-move.css'

export class SelectBoxesOnMouseMove extends React.Component {
    rows = 10;
    cols = 10;

    handleMouse = (evnt) => {
        console.log(evnt);
        evnt.target.setAttribute('class', 'col box highlight');
    }


    render() {
        return (
            <div>
                <h2>Show boxes </h2>
                <div className="boxes">
                    {
                        Array(this.rows).fill(null).map((rowIndex, rowValue) => {
                            return <div class="row" key={rowIndex}>
                                {Array(this.cols).fill(null).map((colIndex, ColValue) => {
                                    return <div className="col box" key={rowIndex + '-' + colIndex} onMouseEnter={this.handleMouse}></div>
                                })}
                            </div>
                        })
                    }
                </div>
            </div>
        )
    }
}
