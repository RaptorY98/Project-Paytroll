/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_paytroll_karyawan.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import program_paytroll_karyawan.Config.DbConnection;
import program_paytroll_karyawan.Model.DepartementModel;
import program_paytroll_karyawan.Model.DivisionModel;
import program_paytroll_karyawan.Model.PeriodeModel;

/**
 *
 * @author lincbp
 */
public class PeriodeDAO implements ImplementPeriode {
    private List<PeriodeModel> list;

    @Override
    public void input(PeriodeModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(PeriodeModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PeriodeModel> getData(String search) {
        list = new ArrayList<PeriodeModel>();
        
        try {
            String like = "'%"+search+"%'";
            Statement statement = DbConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM periode p WHERE p.name LIKE "+like+" OR p.start_date = '"+search+"' OR p.end_date = '"+like+"'");
            
            while (result.next()) { 
                PeriodeModel model = new PeriodeModel();
                model.setPeriode_id(result.getInt("periode_id"));
                model.setName(result.getString("name"));
                model.setStart_date(result.getDate("start_date"));
                model.setEnd_date(result.getDate("end_date"));
                model.setCreated_at(result.getTimestamp("created_at"));
                model.setUpdated_at(result.getTimestamp("updated_at"));
                list.add(model);
            }
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DepartementDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<PeriodeModel> getAllData() {
        list = new ArrayList<PeriodeModel>();
        
        try {
            Statement statement = DbConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM periode p");
            
            while (result.next()) { 
                PeriodeModel model = new PeriodeModel();
                model.setPeriode_id(result.getInt("periode_id"));
                model.setName(result.getString("name"));
                model.setStart_date(result.getDate("start_date"));
                model.setEnd_date(result.getDate("end_date"));
                model.setCreated_at(result.getTimestamp("created_at"));
                model.setUpdated_at(result.getTimestamp("updated_at"));
                list.add(model);
            }
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DepartementDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public PeriodeModel getDetail(int id) {
        try {
            
            Statement statement = DbConnection.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM periode where periode_id = '"+id+"' limit 1");
            
            PeriodeModel model = new PeriodeModel();

            if(result.next()) { 
                model.setPeriode_id(result.getInt("periode_id"));
                model.setName(result.getString("name"));
                model.setStart_date(result.getDate("start_date"));
                model.setEnd_date(result.getDate("end_date"));
                model.setCreated_at(result.getTimestamp("created_at"));
                model.setUpdated_at(result.getTimestamp("updated_at"));
            }
            statement.close();
            result.close();
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(DepartementDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
