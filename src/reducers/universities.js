const universities = (state = {}, { action, payload }) => {
  switch (action) {
    case 'GET_UNIVERSITIES':
      return payload
    default:
      return state
  }
}

export default universities
