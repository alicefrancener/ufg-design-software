'use strict';

var utils = require('../utils/writer.js');
var Leses = require('../service/LesesService');

module.exports.lesoesGet = function lesoesGet (req, res, next) {
  Leses.lesoesGet()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
