import { uniq } from 'lodash';
import insane from 'insane';
import jsonp from 'jsonp';
import { apiKey, url as website, sayHi } from './src/config';

import User, { createURL, gravatar } from './src/user';

const user = new User('Jung Test', 'juhuyoon@gmail.com', 'junghoonyoon.com');
console.log(user);
const profile = createURL(user.name);
console.log(profile);
const image = gravatar(user.email);
console.log(image);
