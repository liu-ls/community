package life.school.community.cache;

import life.school.community.dto.TagDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TagCache {
    public static List<TagDTO> get() {
        List<TagDTO> tagDTOS = new ArrayList<>();
        TagDTO program = new TagDTO();
        program.setCategoryName("教学机构");
        program.setTags(Arrays.asList("冶金学院", "材料学院", "化工学院", "机械学院", "电气学院", "计算机学院", "数理学院", "公法学院", "建工学院", "商学院", "艺设学院", "管工学院", "外国语学院", "能环学院", "马克思主义学院", "体育部", "创新教育学院"));
        tagDTOS.add(program);

        TagDTO framework = new TagDTO();
        framework.setCategoryName("教育教学");
        framework.setTags(Arrays.asList("教务处", "教务系统", "成绩", "课堂考勤", "培养计划", "校历", "毕业设计", "网络教学平台", "振华图书馆", "就业指导中心", "点名", "学籍", "考试", "体育课", "选课", "补选", "免听", "重修", "公共选修课", "双学位", "转专业", "新生", "毕业生", "导师", "辅导员", "老师联系方式"));
        tagDTOS.add(framework);


        TagDTO server = new TagDTO();
        server.setCategoryName("校园生活");
        server.setTags(Arrays.asList("佳山校区", "秀山校区", "新大活", "教D", "学生公寓", "食堂", "浴室", "菜鸟驿站", "快递", "作息时间", "放假", "校医院", "阶教103", "操场", "荟灵湖", "教学楼", "打印店", "阶教", "研究生食堂", "教师公寓", "地理位置", "教室"));
        tagDTOS.add(server);

        TagDTO db = new TagDTO();
        db.setCategoryName("等级考试");
        db.setTags(Arrays.asList("四级", "六级", "省二", "国二", "普通话水平测试", "ACCA", "考研"));
        tagDTOS.add(db);

        TagDTO tool = new TagDTO();
        tool.setCategoryName("毕业季");
        tool.setTags(Arrays.asList("毕业生", "毕业设计", "毕业论文", "答辩", "答辩时间", "离校", "毕业照", "毕业班", "论文查重"));
        tagDTOS.add(tool);
        return tagDTOS;
    }

    //验证
    public static String filterInvalid(String tags) {
        String[] split = StringUtils.split(tags, "，");
        List<TagDTO> tagDTOS = get();

        List<String> tagList = tagDTOS.stream().flatMap(tag -> tag.getTags().stream()).collect(Collectors.toList());
        String invalid = Arrays.stream(split).filter(t -> !tagList.contains(t)).collect(Collectors.joining(","));
        return invalid;
    }
}