package com.e_store.e_store.domain;
import org.hibernate.annotations.GenericGenerator;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.View;

import javax.persistence.*;
import java.util.Date;

@Erupt(name = "简单的例子")
@Table(name = "dog")
@Entity
public class Dog {

    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "native")
    @Column(name = "id")
    @EruptField
    private Long id; //如果继承BaseModel不能再重复声明id

    @EruptField(
            views = @View(title = "狗名字"),
            edit = @Edit(title = "狗名字")
    )
    private String input;

    @EruptField(
            views = @View(title = "体重"),
            edit = @Edit(title = "体重")
    )
    private Integer weight = 100;  //默认值100

    @EruptField(
            views = @View(title = "时间"),
            edit = @Edit(title = "时间")
    )
    private Date date;

}
