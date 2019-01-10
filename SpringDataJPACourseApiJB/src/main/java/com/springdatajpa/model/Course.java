package com.springdatajpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

		@Id
		private String id;
		private String name;
		private String description;
		
		@ManyToOne //means many Courses can be associated to One Topic OR One Topic can have Many Courses
		private Topic topic; //foreign key of the primary key of the Topic table

		public String getDescription() {
			return description;
		}

		public String getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Topic [id=" + id + ", name=" + name + ", description=" + description + "]";
		}

		public Course(String id, String name, String description) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
		}

		public Course() {
			//no-arg constructor
		}

		public Topic getTopic() {
			return topic;
		}

		public void setTopic(Topic topic) {
			this.topic = topic;
		}
}


