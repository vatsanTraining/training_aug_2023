import React, { Component } from 'react';
import Button from './Button';

class Blog extends Component {

    constructor(props){

      super(props)
       
       this.state = {
         count:1
      }
    }
    handleClick =() =>{
        this.setState({count:this.state.count+1})
    }
    render() {
        return (
            <div>
                <Button handleClick={this.handleClick} count={this.state.count}></Button>
                
            </div>
        );
    }
}

export default Blog;