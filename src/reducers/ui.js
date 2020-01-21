const initialState = {
  loading: false,
  logged: false
}

const ui = (state = initialState, { type, payload }) => {
  switch (type) {
    case 'START_LOADING':
      return {
        ...state,
        loading: true
      }
    case 'STOP_LOADING':
      return {
        ...state,
        loading: false
      }
    case 'SET_LOGGED':
      return {
        ...state,
        logged: payload
      }
    default:
      return state
  }
}

export default ui
