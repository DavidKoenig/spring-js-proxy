module.exports = {
    devServer: {
      proxy: {
        '^/api': {
          target: 'http://localhost:8550',
          changeOrigin: true
        },
      }
    }
  }