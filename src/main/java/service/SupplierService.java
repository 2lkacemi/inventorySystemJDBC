package service;

import dao.SupplierRepository;
import model.Supplier;

import java.sql.SQLException;

public class SupplierService {

    SupplierRepository supplierRepository = new SupplierRepository();

    public void deleteSupplier(int id){
        supplierRepository.deleteSupplier(id);
    }

    public void addSupplier(Supplier supplier){
        supplierRepository.insertSupplier(supplier);
    }

    public Supplier getSupplier(int id) throws SQLException {
        return supplierRepository.selectSupplierById(id);
    }

    public void getAllSuppliers() throws SQLException {
        for (Supplier supplier:
             supplierRepository.selectAllSuppliers()) {
            System.out.println(supplier);
        }
    }

    public void updateSupplier(int id, Supplier supplier){
        supplierRepository.updateSupplier(id, supplier);
    }
}
