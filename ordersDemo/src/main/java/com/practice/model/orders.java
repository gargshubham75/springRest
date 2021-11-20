package com.practice.model;

	import org.springframework.data.annotation.Id;
	import org.springframework.data.mongodb.core.mapping.Document;

	@Document
	public class orders {
		@Id
		private int orderid;
		private String ordername;
		
		public orders() {
			super();
			// TODO Auto-generated constructor stub
		}
		public orders(int orderid, String ordername) {
			super();
			this.orderid = orderid;
			this.ordername = ordername;
		}
		public int getOrderid() {
			return orderid;
		}
		public String getOrdername() {
			return ordername;
		}
		@Override
		public String toString() {
			return "orders [orderid=" + orderid + ", ordername=" + ordername + "]";
		}
	}
