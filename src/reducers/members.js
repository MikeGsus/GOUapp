const members = (state = {}, { action, payload }) => {
  switch (action) {
    case 'GET_MEMBERS':
      return payload
    default:
      return state
  }
}

export default members
