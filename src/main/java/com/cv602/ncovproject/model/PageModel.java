package com.cv602.ncovproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author qin
 * @create 2022--10--12--9:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageModel<T> {
    private List<T> rows;  // 显示数据
    private long totalCount;  // 数据总数
    private long totalPage;  // 总页数
}
