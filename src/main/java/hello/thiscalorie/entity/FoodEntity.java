package hello.thiscalorie.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "food")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String foodName;
    String servingSize;
    String calories;
    String carbs;
    String protein;
    String fat;
    String sugars;
    String sodium;
    String cholesterol;
    String saturatedFat;
    String transFat;



}
