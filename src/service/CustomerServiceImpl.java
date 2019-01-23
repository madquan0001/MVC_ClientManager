package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    private static Map<Integer, Customer>customers;

    static{
        customers = new HashMap<>();
        customers.put(1,new Customer(1, "Hoàng", "hoang@codegym.com", "Hà Nội"));
        customers.put(2,new Customer(2, "Quyền", "quyen@codegym.com", "Thanh Hóa"));
        customers.put(3,new Customer(3, "Chính", "chinh@codegym.com", "Hà Nội"));
        customers.put(4,new Customer(4, "Long", "long@codegym.com", "Hà Nội"));
    }

    @Override
    public List<Customer>findAll(){
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer){
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id){
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer){
        customers.put(id,customer);
    }

    public void remove(int id){
        customers.remove(id);
    }

}
