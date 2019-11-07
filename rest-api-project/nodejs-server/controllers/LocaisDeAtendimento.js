'use strict';

var utils = require('../utils/writer.js');
var LocaisDeAtendimento = require('../service/LocaisDeAtendimentoService');

module.exports.getAll = function getAll (req, res, next) {
  LocaisDeAtendimento.getAll()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.locaisDeAtendimentoByRegiaoGet = function locaisDeAtendimentoByRegiaoGet (req, res, next) {
  var regiao = req.swagger.params['regiao'].value;
  LocaisDeAtendimento.locaisDeAtendimentoByRegiaoGet(regiao)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
