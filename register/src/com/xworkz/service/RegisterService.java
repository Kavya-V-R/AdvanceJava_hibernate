package com.xworkz.service;

import com.xworkz.entity.RegisterEntity;

public interface RegisterService {
	boolean validateAndSave(RegisterEntity entity);
}
