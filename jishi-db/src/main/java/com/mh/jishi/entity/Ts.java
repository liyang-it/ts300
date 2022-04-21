package com.mh.jishi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author Evan
 * @since 2022-04-20
 */
@ApiModel(value = "Ts对象", description = "")
public class Ts implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("诗集类型")
    private String type;

    @ApiModelProperty("作者")
    private String author;

    @ApiModelProperty("诗集标题名称")
    private String title;

    @ApiModelProperty("诗集内容")
    private String contents;

    @ApiModelProperty("解释")
    private String explanation;

    @ApiModelProperty("赏析")
    private String appreciation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
    public String getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }

    @Override
    public String toString() {
        return "Ts{" +
            "id=" + id +
            ", type=" + type +
            ", author=" + author +
            ", title=" + title +
            ", contents=" + contents +
            ", explanation=" + explanation +
            ", appreciation=" + appreciation +
        "}";
    }
}
