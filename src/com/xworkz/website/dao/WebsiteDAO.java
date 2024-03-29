package com.xworkz.website.dao;

import java.util.List;

import com.xworkz.website.entity.WebsiteEntity;

public interface WebsiteDAO {
	void putall(List<WebsiteEntity> entity);

	WebsiteEntity getByNameGoogle();

	WebsiteEntity getByLikeUrlx();

	WebsiteEntity getByMinSince();

	WebsiteEntity getByMaxSince();

	WebsiteEntity getBySecondMinSince();

	WebsiteEntity getBySecondMaxSince();

}
