package com.cube.cell.database;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Database {

	SessionFactory factory = null;
	
	private Class[] pojoModels;
	
	public Database(Class[] pojos) {
		this.pojoModels = pojos;
		this.config();
	}
	
	private void config() {
		Configuration configuration = new Configuration().configure();
		configuration = this.setAnnotationClasses(configuration);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        factory = configuration
                .buildSessionFactory(builder.build());
	}

	private Configuration setAnnotationClasses(Configuration configuration) {
		for(int i = 0; i < pojoModels.length; i++) {
			configuration.addAnnotatedClass(pojoModels[i]);
		}
		return configuration;
	}

	public static void create() {
		
	}
}
