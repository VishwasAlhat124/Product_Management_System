package com.jka.daoIMPL;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.AggregateProjection;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jka.dao.ProductDao;
import com.jka.entity.Product;

@Repository
public class ProductDaoIMPL implements ProductDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public String saveProduct(Product product) {
		String msg = null;

		try (Session session = sf.openSession()) {

			Transaction transaction = session.beginTransaction();

			session.save(product);

			transaction.commit();

			msg = "Product Added Sucessfully...!";

		} catch (Exception e) {
			e.printStackTrace();
			msg = "Something went wrong...!";
		}
		return msg;
	}

	@Override
	public Product getProductById(long productId) {
		Product product = null;
		try (Session session = sf.openSession()) {

			product = session.get(Product.class, productId);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> allProduct = new ArrayList<Product>();
		try (Session session = sf.openSession()) {

			Criteria criteria = session.createCriteria(Product.class);
			allProduct = criteria.list();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return allProduct;
	}

	@Override
	public String deleteProduct(long productId) {

		String msg = null;
		try (Session session = sf.openSession()) {

			Transaction transaction = session.beginTransaction();
			Product product = session.get(Product.class, productId);
			session.delete(product);
			transaction.commit();
			msg = "Product Deleted Sucessfully...!";

		} catch (Exception e) {
			e.printStackTrace();
			msg = "Something went wrong...!";
		}
		return msg;
	}

	@Override
	public String updateProduct(long productId) {

		String msg = null;
		try (Session session = sf.openSession()) {

			Transaction transaction = session.beginTransaction();
			Product product = session.get(Product.class, productId);
			product.setProductName("Dining Sets");
			session.saveOrUpdate(product);
			transaction.commit();
			msg = "Product Updated Sucessfully...!";

		} catch (Exception e) {
			e.printStackTrace();
			msg = "Something went wrong...!";
		}
		return msg;
	}

	@Override
	public List<Product> sortProductById_ASC() {
		List<Product> products = null;

		try (Session session = sf.openSession()) {

			Criteria criteria = session.createCriteria(Product.class);

			criteria.addOrder(Order.asc("productId"));

			products = criteria.list();

			System.out.println("✅ Total products retrieved: " + products.size());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public List<Product> sortProductByName_DESC() {
		List<Product> products = null;

		try (Session session = sf.openSession()) {

			Criteria criteria = session.createCriteria(Product.class);

			criteria.addOrder(Order.asc("productName"));

			products = criteria.list();

			System.out.println("✅ Total products retrieved: " + products.size());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public double getmaxPriceProducts() {

		double maxprice = 0.0;

		try (Session session = sf.openSession()) {

			Criteria criteria = session.createCriteria(Product.class);
	        criteria.setProjection(Projections.max("productPrice")); 

	        Object result = criteria.uniqueResult();

	        if (result != null) {
	            maxprice = (double) result;
	        }

		} catch (Exception e) {
			e.printStackTrace();
		}
		return maxprice;
	}

	@Override
	public long countSumOfProductPrice() {
		long sumprice = 0;

		try (Session session = sf.openSession()) {

			Criteria criteria = session.createCriteria(Product.class);
	        criteria.setProjection(Projections.sum("productPrice")); 

	        Object result = criteria.uniqueResult();

	        if (result != null) {
	            // Convert properly
	            if (result instanceof Number) {
	                sumprice = ((Number) result).longValue();
	            }
	        }

		} catch (Exception e) {
			e.printStackTrace();
		}
		return sumprice;
	}

	@Override
	public long getTotalCountOfProducts() {
		long totalCount = 0;

	    try (Session session = sf.openSession()) {
	        Criteria criteria = session.createCriteria(Product.class);
	        criteria.setProjection(Projections.rowCount());

	        Object result = criteria.uniqueResult();

	        if (result != null && result instanceof Number) {
	            totalCount = ((Number) result).longValue();
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return totalCount;
	}

}
