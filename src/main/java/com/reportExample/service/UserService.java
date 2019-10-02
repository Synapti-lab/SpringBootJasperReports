/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reportExample.service;

import com.reportExample.dao.UserDaoImpl;
import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;

@Service
public class UserService {

 @Autowired
 private UserDaoImpl userDao;
 
 public JasperPrint exportPdfFile() throws SQLException, JRException, IOException {
  return userDao.exportPdfFile();
 }
}
