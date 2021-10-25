package com.dkne.metabang.domain.image;

import com.dkne.metabang.domain.image.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ImageRepository  extends JpaRepository<Image,Integer>, JpaSpecificationExecutor<Image> {
}
