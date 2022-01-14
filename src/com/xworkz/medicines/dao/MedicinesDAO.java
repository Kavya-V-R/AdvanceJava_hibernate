package com.xworkz.medicines.dao;

import java.util.List;

import com.xworkz.medicines.entity.MedicinesEntity;

public interface MedicinesDAO {
	void put(MedicinesEntity entity);

	void putAll(List<MedicinesEntity> medicinesEntities);
}