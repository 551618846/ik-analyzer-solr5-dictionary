/**
 * 
 */
package com.ftsafe.ik.dictionary;

import java.util.ArrayList;
import java.util.Collection;

import org.wltea.analyzer.dic.Dictionary;

/**
 * 
 * @author <a href=mailto: zhenliang@ftsafe.com>zhenliang</a>
 *
 */
public class DictionaryProxy {
	
	public static void addWords(){
		Collection<String> words = new ArrayList<String>();
		words.add("测试分词");
		Dictionary dic = Dictionary.getSingleton();
		dic.addWords(words);//调用sync方法
	}
	
	public static void disableWords(){
		Collection<String> words = new ArrayList<String>();
		words.add("测试分词");
		Dictionary dic = Dictionary.getSingleton();
		dic.disableWords(words);//调用sync方法
	}
	
}
