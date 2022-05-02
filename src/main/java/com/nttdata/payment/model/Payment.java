package com.nttdata.payment.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alexander Valerio
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "payments")
public class Payment {

	@Id
	private String paymentId;
	
	@Field(name = "amount", write = Field.Write.NON_NULL)
	private double amount;
	
	@Field(name = "paymentDate", write = Field.Write.NON_NULL)
	private Date paymentDate;
	
	@Field(name = "person_id", write = Field.Write.NON_NULL)
	private String personId;
	
	@Field(name = "product_id", write = Field.Write.NON_NULL)
	private String productId;
	
	@Field(name = "created_at")
	private Date createdAt;
	
	@Field(name = "updated_at")
	private Date updatedAt;

}
