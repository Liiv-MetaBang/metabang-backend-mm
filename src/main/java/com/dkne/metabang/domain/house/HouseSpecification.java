package com.dkne.metabang.domain.house;

import org.springframework.data.jpa.domain.Specification;

public class HouseSpecification {
	
	public static Specification<House> likeAddress(String address) {
        return (Specification<House>) ((root, query, builder) -> 
                builder.equal(root.get("address"), address)
        );
    }
	
	public static Specification<House> betweenLayer(long low_layer, long high_layer) {
        return (Specification<House>) ((root, query, builder) -> 
                builder.between(root.get("layer"), low_layer, high_layer)
        );
    }

//	public static Specification<House> equalHouseId(int house_id) {
//		return new Specification<House>() {
//			@Override
//			public Predicate toPredicate(Root<House> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//				// 1) equal
//				return criteriaBuilder.equal(root.get("house_id"), house_id);
//			}
//		};
//	}
//	
//	public static Specification<House> likeAddress(String address) {
//        return new Specification<House>() {
//            @Override
//            public Predicate toPredicate(Root<House> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//                // 2) like
//                return criteriaBuilder.like(root.get("address"), "%" + address + "%");
//            }
//        };
//    }
//
//    public static Specification<House> betweenPrice(int low_price, int high_price) {
//        return new Specification<House>() {
//            @Override
//            public Predicate toPredicate(Root<House> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//                // 3) between
//                return criteriaBuilder.between(root.get("price"), low_price, high_price);
//            }
//        };
//    }
}
