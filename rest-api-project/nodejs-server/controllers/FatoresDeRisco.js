'use strict';

var utils = require('../utils/writer.js');
var FatoresDeRisco = require('../service/FatoresDeRiscoService');

module.exports.getAllFatoresDeRisco = function getAllFatoresDeRisco (req, res, next) {
  FatoresDeRisco.getAllFatoresDeRisco()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
