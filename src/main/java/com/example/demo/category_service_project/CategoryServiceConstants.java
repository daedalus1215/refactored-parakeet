package com.example.demo.category_service_project;

import com.example.demo.dependency_library.entities.ArticleEntity;

public class CategoryServiceConstants {

  final public static ArticleEntity LOG_4_J_ARTICLE
      = new ArticleEntity("https://www.cisa.gov/uscert/apache-log4j-vulnerability-guidance", "Log4J Vulnerability");

  final public static ArticleEntity HACK_TREZOR_ARTICLE
      = new ArticleEntity("https://cointelegraph.com/news/engineer-hacks-trezor-wallet-recovers-2m-in-lost-crypto", "Trezor 2 mill hack");

  final public static ArticleEntity DAO_HACK_ARTICLE
      = new ArticleEntity("https://www.gemini.com/cryptopedia/the-dao-hack-makerdao", "Dao Hack");
}
