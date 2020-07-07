package com.emmanuel.plumas.p7JavaLibrarEasyApi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class BookEntity implements Serializable{
		
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue
		private Long bookId;
		private String bookTitle;
		private String editor;
		private String bookType;
		
		
		
		public BookEntity(Long bookId, String bookTitle, String editor, String bookType) {
			super();
			this.bookId = bookId;
			this.bookTitle = bookTitle;
			this.editor = editor;
			this.bookType = bookType;
		}
		
		
		
		public BookEntity() {
			super();
		}


		public Long getBookId() {
			return bookId;
		}


		public void setBookId(Long bookId) {
			this.bookId = bookId;
		}


		public String getBookTitle() {
			return bookTitle;
		}


		public void setBookTitle(String bookTitle) {
			this.bookTitle = bookTitle;
		}

		public String getEditor() {
			return editor;
		}


		public void setEditor(String editor) {
			this.editor = editor;
		}


		public String getBookType() {
			return bookType;
		}


		public void setBookType(String bookType) {
			this.bookType = bookType;
		}


		@Override
		public String toString() {
			return "BookEntity [bookId=" + bookId + ", bookTitle=" + bookTitle + ", editor=" + editor + ", bookType=" + bookType + "]";
		}
}
