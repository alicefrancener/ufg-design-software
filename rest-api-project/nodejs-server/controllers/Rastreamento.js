'use strict';

var utils = require('../utils/writer.js');
var Rastreamento = require('../service/RastreamentoService');

module.exports.rastreamentosGet = function rastreamentosGet (req, res, next) {
  Rastreamento.rastreamentosGet()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
