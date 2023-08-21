package com.alibaba.easyexcel.test.demo.write;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentLoopMerge;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.metadata.data.WriteCellData;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 反馈Excel对象
 *
 * @author 892268
 */
@Getter
@Setter
@EqualsAndHashCode
@ContentRowHeight(100)
public class FeedbackExcelData {

    @ColumnWidth(20)
    @ExcelProperty(value = "反馈单号")
    private String feedbackNumber;

    @ColumnWidth(5)
    @ExcelProperty(value = "反馈人类型")
    private String feedbackType;

    @ColumnWidth(10)
    @ExcelProperty(value = "反馈渠道")
    private String feedbackChannel;

    @ColumnWidth(10)
    @ExcelProperty(value = "反馈人")
    private String feedbackUserName;

    @ColumnWidth(15)
    @ExcelProperty(value = "反馈人手机号")
    private String feedbackMobile;

    @ColumnWidth(20)
    @ExcelProperty("反馈时间")
    @DateTimeFormat("yyyy-MM-dd HH:mm:ss")
    private Date feedbackDateTime;

    @ColumnWidth(15)
    @ExcelProperty(value = "运营方")
    private String operator;

    @ColumnWidth(15)
    @ExcelProperty(value = "园区名称")
    private String parkName;

    @ColumnWidth(10)
    @ExcelProperty(value = "问题类型")
    private String questionType;

    @ColumnWidth(30)
    @ExcelProperty(value = "描述")
    private String describe;

    @ColumnWidth(10)
    @ExcelProperty(value = "处理状态")
    private String processingStatus;

    @ColumnWidth(10)
    @ContentLoopMerge(columnExtend = 9)
    @ExcelProperty(value = "图片")
    private WriteCellData<Void> picture0;

    @ColumnWidth(10)
    @ExcelProperty(value = "图片")
    private WriteCellData<Void> picture1;

    @ColumnWidth(10)
    @ExcelProperty(value = "图片")
    private WriteCellData<Void> picture2;

    @ColumnWidth(10)
    @ExcelProperty(value = "图片")
    private WriteCellData<Void> picture3;

    @ColumnWidth(10)
    @ExcelProperty(value = "图片")
    private WriteCellData<Void> picture4;

    @ColumnWidth(10)
    @ExcelProperty(value = "图片")
    private WriteCellData<Void> picture5;

    @ColumnWidth(10)
    @ExcelProperty(value = "图片")
    private WriteCellData<Void> picture6;

    @ColumnWidth(10)
    @ExcelProperty(value = "图片")
    private WriteCellData<Void> picture7;

    @ColumnWidth(10)
    @ExcelProperty(value = "图片")
    private WriteCellData<Void> picture8;


}
