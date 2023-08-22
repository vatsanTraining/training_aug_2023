package com.training.ifaces;

public interface StudentRepository extends CrudRepository {

	double findAverageMark();

}
