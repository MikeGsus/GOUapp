import React, { Component } from 'react'

class Header extends Component {
  constructor () {
    super()
    this.state = {
      visible: false
    }
  }

  render () {
    return (
      <div>
        This is the header
      </div>
    )
  }
}

export default Header
