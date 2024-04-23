/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_paytroll_karyawan.Dao;

import java.sql.Date;
import program_paytroll_karyawan.Model.AbsensiModel;

/**
 *
 * @author lincbp
 */
public interface ImplementAbsen {
    public AbsensiModel getCurrentAbsen(Date absenDate,int EmployeId);
    
    public void checkIn(int employe_id);
    
    public void checkOut(int absensi_id);
}
