package com.nantian.util;

import com.nantian.common.util.CollectionUtils;
import com.nantian.dto.TreeDTO;

import java.util.*;

/**
 * <p>ClassName: TreeUtils</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-01-13</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class TreeUtils {

    public static List<TreeDTO> ascTree(List<TreeDTO> trees) {
        if (CollectionUtils.isNotEmpty (trees)) {
            /*用两个数组来存trees，一个是sorting有值，一个存没能值*/
            //有sorting字段有数据
            List<TreeDTO> sortingNotNull = new ArrayList<TreeDTO> ();
            //sorting字段没有数据
            List<TreeDTO> sortingIsNull = new ArrayList<TreeDTO> ();
            //新的对象
            List<TreeDTO> newTrees = new ArrayList<TreeDTO> ();
            //对sorting的值不同进行分组
            for (TreeDTO tree : trees) {
                if (tree != null) {
                    if (tree.getSorting () != null) {
                        sortingNotNull.add (tree);
                    } else {
                        //没有sorting的tree，全部按默认顺序
                        sortingIsNull.add (tree);
                    }
                }
            }
            //对有值的tree进行排序
            if (CollectionUtils.isNotEmpty (sortingNotNull)) {
                Collections.sort (sortingNotNull, new Comparator<TreeDTO> () {
                    @Override
                    public int compare(TreeDTO o1, TreeDTO o2) {
                        if (o1.getSorting () != null && o2.getSorting () != null) {
                            return o1.getSorting () - o2.getSorting ();
                        } else {
                            return 0;
                        }

                    }
                });
            }
            //组在一个新的trees;
            newTrees.addAll (sortingNotNull);
            newTrees.addAll (sortingIsNull);
            //for 取出每一个chirdrens
            for (TreeDTO tree : newTrees) {
                //排序子节点
                if (CollectionUtils.isNotEmpty (tree.getChildren ())) {
                    tree.setChildren (ascTree (tree.getChildren ()));

                } else {
                    return newTrees;
                }
            }
            return newTrees;
        } else {
            return trees;
        }
    }


}
