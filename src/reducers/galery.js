const galery = (state = [], { action, payload }) => {
  switch (action) {
    case 'GET_PHOTOS':
      return payload
    default:
      return state
  }
}

export default galery