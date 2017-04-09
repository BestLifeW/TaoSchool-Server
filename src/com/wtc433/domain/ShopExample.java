package com.wtc433.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Iterator;

public class ShopExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ShopExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andShopnameIsNull() {
			addCriterion("shopname is null");
			return (Criteria) this;
		}

		public Criteria andShopnameIsNotNull() {
			addCriterion("shopname is not null");
			return (Criteria) this;
		}

		public Criteria andShopnameEqualTo(String value) {
			addCriterion("shopname =", value, "shopname");
			return (Criteria) this;
		}

		public Criteria andShopnameNotEqualTo(String value) {
			addCriterion("shopname <>", value, "shopname");
			return (Criteria) this;
		}

		public Criteria andShopnameGreaterThan(String value) {
			addCriterion("shopname >", value, "shopname");
			return (Criteria) this;
		}

		public Criteria andShopnameGreaterThanOrEqualTo(String value) {
			addCriterion("shopname >=", value, "shopname");
			return (Criteria) this;
		}

		public Criteria andShopnameLessThan(String value) {
			addCriterion("shopname <", value, "shopname");
			return (Criteria) this;
		}

		public Criteria andShopnameLessThanOrEqualTo(String value) {
			addCriterion("shopname <=", value, "shopname");
			return (Criteria) this;
		}

		public Criteria andShopnameLike(String value) {
			addCriterion("shopname like", value, "shopname");
			return (Criteria) this;
		}

		public Criteria andShopnameNotLike(String value) {
			addCriterion("shopname not like", value, "shopname");
			return (Criteria) this;
		}

		public Criteria andShopnameIn(List<String> values) {
			addCriterion("shopname in", values, "shopname");
			return (Criteria) this;
		}

		public Criteria andShopnameNotIn(List<String> values) {
			addCriterion("shopname not in", values, "shopname");
			return (Criteria) this;
		}

		public Criteria andShopnameBetween(String value1, String value2) {
			addCriterion("shopname between", value1, value2, "shopname");
			return (Criteria) this;
		}

		public Criteria andShopnameNotBetween(String value1, String value2) {
			addCriterion("shopname not between", value1, value2, "shopname");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("description is null");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("description is not null");
			return (Criteria) this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("description =", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("description <>", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("description >", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("description >=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("description <", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("description <=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("description like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("description not like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("description in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("description not in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("description between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("description not between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andCategoryIsNull() {
			addCriterion("category is null");
			return (Criteria) this;
		}

		public Criteria andCategoryIsNotNull() {
			addCriterion("category is not null");
			return (Criteria) this;
		}

		public Criteria andCategoryEqualTo(String value) {
			addCriterion("category =", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryNotEqualTo(String value) {
			addCriterion("category <>", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryGreaterThan(String value) {
			addCriterion("category >", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryGreaterThanOrEqualTo(String value) {
			addCriterion("category >=", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryLessThan(String value) {
			addCriterion("category <", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryLessThanOrEqualTo(String value) {
			addCriterion("category <=", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryLike(String value) {
			addCriterion("category like", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryNotLike(String value) {
			addCriterion("category not like", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryIn(List<String> values) {
			addCriterion("category in", values, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryNotIn(List<String> values) {
			addCriterion("category not in", values, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryBetween(String value1, String value2) {
			addCriterion("category between", value1, value2, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryNotBetween(String value1, String value2) {
			addCriterion("category not between", value1, value2, "category");
			return (Criteria) this;
		}

		public Criteria andPictureIsNull() {
			addCriterion("picture is null");
			return (Criteria) this;
		}

		public Criteria andPictureIsNotNull() {
			addCriterion("picture is not null");
			return (Criteria) this;
		}

		public Criteria andPictureEqualTo(String value) {
			addCriterion("picture =", value, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureNotEqualTo(String value) {
			addCriterion("picture <>", value, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureGreaterThan(String value) {
			addCriterion("picture >", value, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureGreaterThanOrEqualTo(String value) {
			addCriterion("picture >=", value, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureLessThan(String value) {
			addCriterion("picture <", value, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureLessThanOrEqualTo(String value) {
			addCriterion("picture <=", value, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureLike(String value) {
			addCriterion("picture like", value, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureNotLike(String value) {
			addCriterion("picture not like", value, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureIn(List<String> values) {
			addCriterion("picture in", values, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureNotIn(List<String> values) {
			addCriterion("picture not in", values, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureBetween(String value1, String value2) {
			addCriterion("picture between", value1, value2, "picture");
			return (Criteria) this;
		}

		public Criteria andPictureNotBetween(String value1, String value2) {
			addCriterion("picture not between", value1, value2, "picture");
			return (Criteria) this;
		}

		public Criteria andPriceIsNull() {
			addCriterion("price is null");
			return (Criteria) this;
		}

		public Criteria andPriceIsNotNull() {
			addCriterion("price is not null");
			return (Criteria) this;
		}

		public Criteria andPriceEqualTo(String value) {
			addCriterion("price =", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotEqualTo(String value) {
			addCriterion("price <>", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceGreaterThan(String value) {
			addCriterion("price >", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceGreaterThanOrEqualTo(String value) {
			addCriterion("price >=", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceLessThan(String value) {
			addCriterion("price <", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceLessThanOrEqualTo(String value) {
			addCriterion("price <=", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceLike(String value) {
			addCriterion("price like", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotLike(String value) {
			addCriterion("price not like", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceIn(List<String> values) {
			addCriterion("price in", values, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotIn(List<String> values) {
			addCriterion("price not in", values, "price");
			return (Criteria) this;
		}

		public Criteria andPriceBetween(String value1, String value2) {
			addCriterion("price between", value1, value2, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotBetween(String value1, String value2) {
			addCriterion("price not between", value1, value2, "price");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNull() {
			addCriterion("username is null");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNotNull() {
			addCriterion("username is not null");
			return (Criteria) this;
		}

		public Criteria andUsernameEqualTo(String value) {
			addCriterion("username =", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("username <>", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("username >", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("username >=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThan(String value) {
			addCriterion("username <", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("username <=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLike(String value) {
			addCriterion("username like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotLike(String value) {
			addCriterion("username not like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameIn(List<String> values) {
			addCriterion("username in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("username not in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("username between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("username not between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andOldpriceIsNull() {
			addCriterion("oldprice is null");
			return (Criteria) this;
		}

		public Criteria andOldpriceIsNotNull() {
			addCriterion("oldprice is not null");
			return (Criteria) this;
		}

		public Criteria andOldpriceEqualTo(String value) {
			addCriterion("oldprice =", value, "oldprice");
			return (Criteria) this;
		}

		public Criteria andOldpriceNotEqualTo(String value) {
			addCriterion("oldprice <>", value, "oldprice");
			return (Criteria) this;
		}

		public Criteria andOldpriceGreaterThan(String value) {
			addCriterion("oldprice >", value, "oldprice");
			return (Criteria) this;
		}

		public Criteria andOldpriceGreaterThanOrEqualTo(String value) {
			addCriterion("oldprice >=", value, "oldprice");
			return (Criteria) this;
		}

		public Criteria andOldpriceLessThan(String value) {
			addCriterion("oldprice <", value, "oldprice");
			return (Criteria) this;
		}

		public Criteria andOldpriceLessThanOrEqualTo(String value) {
			addCriterion("oldprice <=", value, "oldprice");
			return (Criteria) this;
		}

		public Criteria andOldpriceLike(String value) {
			addCriterion("oldprice like", value, "oldprice");
			return (Criteria) this;
		}

		public Criteria andOldpriceNotLike(String value) {
			addCriterion("oldprice not like", value, "oldprice");
			return (Criteria) this;
		}

		public Criteria andOldpriceIn(List<String> values) {
			addCriterion("oldprice in", values, "oldprice");
			return (Criteria) this;
		}

		public Criteria andOldpriceNotIn(List<String> values) {
			addCriterion("oldprice not in", values, "oldprice");
			return (Criteria) this;
		}

		public Criteria andOldpriceBetween(String value1, String value2) {
			addCriterion("oldprice between", value1, value2, "oldprice");
			return (Criteria) this;
		}

		public Criteria andOldpriceNotBetween(String value1, String value2) {
			addCriterion("oldprice not between", value1, value2, "oldprice");
			return (Criteria) this;
		}

		public Criteria andShoptimeIsNull() {
			addCriterion("shoptime is null");
			return (Criteria) this;
		}

		public Criteria andShoptimeIsNotNull() {
			addCriterion("shoptime is not null");
			return (Criteria) this;
		}

		public Criteria andShoptimeEqualTo(Date value) {
			addCriterionForJDBCDate("shoptime =", value, "shoptime");
			return (Criteria) this;
		}

		public Criteria andShoptimeNotEqualTo(Date value) {
			addCriterionForJDBCDate("shoptime <>", value, "shoptime");
			return (Criteria) this;
		}

		public Criteria andShoptimeGreaterThan(Date value) {
			addCriterionForJDBCDate("shoptime >", value, "shoptime");
			return (Criteria) this;
		}

		public Criteria andShoptimeGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("shoptime >=", value, "shoptime");
			return (Criteria) this;
		}

		public Criteria andShoptimeLessThan(Date value) {
			addCriterionForJDBCDate("shoptime <", value, "shoptime");
			return (Criteria) this;
		}

		public Criteria andShoptimeLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("shoptime <=", value, "shoptime");
			return (Criteria) this;
		}

		public Criteria andShoptimeIn(List<Date> values) {
			addCriterionForJDBCDate("shoptime in", values, "shoptime");
			return (Criteria) this;
		}

		public Criteria andShoptimeNotIn(List<Date> values) {
			addCriterionForJDBCDate("shoptime not in", values, "shoptime");
			return (Criteria) this;
		}

		public Criteria andShoptimeBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("shoptime between", value1, value2, "shoptime");
			return (Criteria) this;
		}

		public Criteria andShoptimeNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("shoptime not between", value1, value2, "shoptime");
			return (Criteria) this;
		}

		public Criteria andStateIsNull() {
			addCriterion("state is null");
			return (Criteria) this;
		}

		public Criteria andStateIsNotNull() {
			addCriterion("state is not null");
			return (Criteria) this;
		}

		public Criteria andStateEqualTo(Integer value) {
			addCriterion("state =", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotEqualTo(Integer value) {
			addCriterion("state <>", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThan(Integer value) {
			addCriterion("state >", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThanOrEqualTo(Integer value) {
			addCriterion("state >=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThan(Integer value) {
			addCriterion("state <", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThanOrEqualTo(Integer value) {
			addCriterion("state <=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateIn(List<Integer> values) {
			addCriterion("state in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotIn(List<Integer> values) {
			addCriterion("state not in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateBetween(Integer value1, Integer value2) {
			addCriterion("state between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotBetween(Integer value1, Integer value2) {
			addCriterion("state not between", value1, value2, "state");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {
		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}