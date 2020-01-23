import React, { Component } from 'react'

import {
	CenterContainer,
	Container,
	Content,
	SideBar	
} from './styled'

class Wrapper extends Component {
	render () {
		return (
			<Container>
				<CenterContainer>
					<SideBar />
					<Content />
				</CenterContainer>
			</Container>
		)
	}
}

export default Wrapper
