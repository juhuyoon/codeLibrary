const webpack = require('webpack');
const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');

process.env.NODE_ENV = 'development';

module.exports = {
    mode: 'development',
    target: 'web',
    devtool: 'cheap-module-source-map', //can see original code in browswer
    entry: './src/index',
    output: {
        // Webpack doesn't output code in dev mode, it serves app from memory
        path: path.resolve(__dirname, "build"),
        publicPath: '/', 
        filename: 'bundle.js'
    },
    devServer: {
        stats: 'minimal',
        overlay: true,
        historyApiFallback: true,
        disableHostCheck: true,
        headers: {'Access-Control-Allow-Origin': '*'},
        https: false
    },
    plugins: [
        new HtmlWebpackPlugin({
            template: 'src/index.html',
        })
    ],
    module: {
        rules: [
            {
                test: /\.(js|jsx)$/,
                exclude: /node_modules/,
                use: ["babel-loader", "eslint-loader"]
            },
            {
                test: /(\.css)$/,
                use: ['style-loader', 'css-loader']
            }
        ]
    }
}